var path = require('path');
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
        // Test settings
        karma: {
            options: {
                // point all tasks to karma config file
                configFile: 'karma.conf.js'
            },
            unit: {
                // run tests once instead of continuously
                singleRun: true
            }
        },
        watch: {
            options: {
                livereload: true
            },
            express: {
                files: [ 'server.js' ],
                options: {
                    spawn: false
                }
            }
        },
        //start express server and run server.js
        express: {
            options: {
                port: 9000,
                hostname: 'localhost'
            },
            livereload: {
                options: {
                    server: path.resolve('./server.js'),
                    livereload: true,
                    serverreload: true,
                    bases: [path.resolve('./app'), path.resolve('./bower_components')]
                }
            }
            /*dev: {
             options: {
             script: 'server.js'
             }
             }*/
        }
    });

    // Load the plugin that provides the "uglify" task.
    grunt.loadNpmTasks('grunt-contrib-jshint');
    grunt.loadNpmTasks('grunt-contrib-uglify');
    grunt.loadNpmTasks('grunt-contrib-watch');
    grunt.loadNpmTasks('grunt-express');
    grunt.loadNpmTasks('grunt-karma');

    // Default task(s).
    grunt.registerTask('default', ['uglify', 'jshint']);
    grunt.registerTask('server', ['express', 'express-keepalive']);
    grunt.registerTask('ut', ['karma:unit']);

};
