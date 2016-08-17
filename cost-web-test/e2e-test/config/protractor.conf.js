var HtmlScreenshotReporter = require('protractor-jasmine2-screenshot-reporter');

var reporter = new HtmlScreenshotReporter({
    dest: './e2e-test/target/screenshots',
    filename: 'my-report.html',
    cleanDestination: false,
    showSummary: false,
    showConfiguration: false,
    reportTitle: null,
    captureOnlyFailedSpecs: true,
    showSummary: true
});
exports.config = {
    framework: 'jasmine',

    // Capabilities to be passed to the webdriver instance.
    seleniumAddress: 'http://localhost:4444/wd/hub',

    // Spec patterns are relative to the current working directly when
    // protractor is called.
    specs: ['../../e2e-test/**/*.js'],

    baseUrl: 'http://localhost:9000',
    rootElement: 'body',

    // Capabilities to be passed to the webdriver instance.
    multiCapabilities: [
        {
            browserName: 'phantomjs'
        }
    ],
    beforeLaunch: function () {
        return new Promise(function (resolve) {
            reporter.beforeLaunch(resolve);
        });
    },
    onPrepare: function () {
        var SpecReporter = require('jasmine-spec-reporter');
        // add jasmine spec reporter
//        jasmine.getEnv().addReporter(new SpecReporter({displayStacktrace: 'all'}));
        jasmine.getEnv().addReporter(reporter);

    },
    // Assign the test reporter to each running instance


    // Close the report after all tests finish
    afterLaunch: function (exitCode) {
        return new Promise(function (resolve) {
            reporter.afterLaunch(resolve.bind(this, exitCode));
        });
    },
    // use this config to have a visual feedback of all tests


    // Options to be passed to Jasmine-node.
    jasmineNodeOpts: {
        showColors: true,
        defaultTimeoutInterval: 30000,
        isVerbose: true,
        includeStackTrace: true
    }
}
