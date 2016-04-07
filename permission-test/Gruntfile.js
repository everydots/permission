module.exports = function (grunt) {

    // Project configuration.
    grunt.initConfig({
        pkg: grunt.file.readJSON('package.json'),
        uglify: {
            options: {
                banner: '/*! <%= pkg.name %> <%= grunt.template.today("yyyy-mm-dd") %> */\n'
            },
            build: {
                src: 'src/<%= pkg.name %>.js',
                dest: 'build/<%= pkg.name %>.min.js'
            }
        },
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
    grunt.loadNpmTasks('grunt-protractor-runner');

    // Default task(s).
    grunt.registerTask('default', ['uglify', 'jshint']);
    grunt.registerTask('e2e', ['protractor:e2e']);

};
