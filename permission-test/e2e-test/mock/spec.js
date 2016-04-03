describe('Protractor demo app', function () {

    beforeEach(function () {
        // Load up a view and wait for it to be done with its rendering and epicycles.
        /*browser.get('#/example');
        browser.waitForAngular();*/

        browser.get('http://juliemr.github.io/protractor-demo/');
    });

    it('should have a title', function () {
        expect(browser.getTitle()).toEqual('Super Calculator');
    });

    it('should add one and two', function () {
        element(by.model('first')).sendKeys(1);
        element(by.model('second')).sendKeys(2);

        element(by.id('gobutton')).click();
        expect(element(by.binding('latest')).getText()).toEqual('3');
    });
})