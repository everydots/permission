module.exports = function (grunt) {

    // Project configuration.
    grunt.initConfig({
        mkdir: {
            all: {
                options: {
                    create: ['e2e-test/target/screenshots']
                }
            }
        },
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
        uglify: {
            options: {
                compress: true,
                mangle: true,
                mangleProperties: true,
                reserveDOMCache: true
            }
        },
        clean: {
            /*options: {
             force: true
             },*/
            src: ['.tmp/**']
        },
        useminPrepare: {
            html: ['app/index.html', 'app/home.html'],
            options: {
                dest: 'app/dist',
                flow: {
                    html: {
                        steps: {
                            js: ['concat', 'uglify']
                        }
                    }
                }
            }
        },
        usemin: {
            html: ['app/*.html'],
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
                configFile: "e2e-test/config/protractor.conf.js",
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
        },
        mochaTest: {
            test: {
                options: {
                    reporter: 'mochawesome', //You need to change this !
                    colors: true,
                    summery: true,
                    captureFile: 'target/test-report.html',
                    quiet: false,
                    clearRequireCache: true
                },
                src: ['integration-test/*.js'],
                excludes: ['plugins']
            }
        }
    });

    // Load the plugin that provides the "uglify" task.
    /*grunt.loadNpmTasks('grunt-contrib-jshint');
     grunt.loadNpmTasks('grunt-contrib-uglify');
     grunt.loadNpmTasks('grunt-contrib-concat');
     grunt.loadNpmTasks('grunt-contrib-clean');*/
    //grunt.loadNpmTasks('grunt-protractor-runner');
    //grunt.loadNpmTasks('grunt-usemin');

    require('load-grunt-tasks')(grunt);

    grunt.loadNpmTasks('grunt-mocha-test')
    // Default task(s).
    grunt.registerTask('default', ['uglify', 'jshint']);
    grunt.registerTask('int', ['mochaTest']);
    grunt.registerTask('e2e', ['mkdir', 'protractor:e2e']);
    grunt.registerTask('minify', ['useminPrepare', 'concat:generated', 'uglify:generated', 'usemin', 'clean']);
    grunt.registerTask('min', ['uglify:generated']);

    //grunt.registerTask('minifyClean', ['clean']);
};
