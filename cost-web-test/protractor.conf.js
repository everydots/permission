exports.config = {
    framework: 'jasmine',

    // Capabilities to be passed to the webdriver instance.
    seleniumAddress: 'http://localhost:4444/wd/hub',

    // Spec patterns are relative to the current working directly when
    // protractor is called.
    specs: ['e2e-test/**/*spec.js'],

    baseUrl: 'http://localhost:9000',
    rootElement: 'body',

    // Capabilities to be passed to the webdriver instance.
    multiCapabilities: [
        {
            browserName: 'chrome'
        }
    ],

    // use this config to have a visual feedback of all tests
    onPrepare: function () {
        var SpecReporter = require('jasmine-spec-reporter');
        // add jasmine spec reporter
        jasmine.getEnv().addReporter(new SpecReporter({displayStacktrace: 'all'}));
    },

    // Options to be passed to Jasmine-node.
    jasmineNodeOpts: {
        showColors: true,
        defaultTimeoutInterval: 30000,
        isVerbose: true,
        includeStackTrace: true
    }
}
