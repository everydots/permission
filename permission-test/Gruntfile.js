module.exports = function (grunt) {

    // Project configuration.
    grunt.initConfig({
        pkg: grunt.file.readJSON('package.json'),
        jshint: {
            files: ['Gruntfile.js', 'specs/*.js'],
            options: {
                // options here to override JSHint defaults
                globals: {
                    jQuery: true,
                    console: true,
                    module: true,
                    document: true
                }
            }
        },
        useminPrepare: {
            html: 'app/index.html',
            options: {
                dest: 'app/dist',
                flow: {
                    html: {
                        steps: {
                            js: ['concat', 'uglify']
                        },
                        post: {}
                    }
                }
            }
        },
        usemin: {
            html: ['app/index.html'],
            js: ['app/dist/{,*/}*.js'],
            options: {
                blockReplacements: {
                    js: function (block) {
                        console.log(block);
                        return '<script type="application/javascript" src="dist/' + block.dest + '"></script>'
                    }
                }
            }
        },
        protractor: {
            options: {
                keepAlive: true,
                configFile: "protractor.conf.js",
                noColor: true
            },
            e2e: {
                options: {
                    keepAlive: true,
                    args: {
                        seleniumPort: 4444
                    }
                }
            },
            terminate: {
                options: {
                    keepAlive: false
                }
            }
        }
    });

    // Load the plugin that provides the "uglify" task.
    grunt.loadNpmTasks('grunt-contrib-jshint');
    grunt.loadNpmTasks('grunt-contrib-uglify');
    grunt.loadNpmTasks('grunt-contrib-concat');
    grunt.loadNpmTasks('grunt-protractor-runner');
    grunt.loadNpmTasks('grunt-usemin');

    // Default task(s).
    grunt.registerTask('default', ['uglify', 'jshint']);
    grunt.registerTask('e2e', ['protractor:e2e']);
    grunt.registerTask('minify', ['useminPrepare', 'concat:generated', 'uglify:generated']);

};
