describe('cost web app', function () {
    var page = require('./utils/page.js');
    var data = require('./data/user.json');
    beforeEach(function () {
        browser.get('/#/main');
    });

    it('should have a title', function () {
        expect(browser.getTitle()).toEqual('cost-web');
    });

    it('should register success', function () {
        page.register.clickRegister();
        expect(browser.getCurrentUrl()).toEqual('http://localhost:9000/#/register');
        page.register.inputRegisterInfo(data.yan);
        page.register.clickSignUp();
        browser.waitForAngular();
        expect(browser.getCurrentUrl()).toEqual('http://localhost:9000/#/login')
    });

    it('should login success', function () {
        page.login.clickLogin();
        expect(browser.getCurrentUrl()).toEqual('http://localhost:9000/#/login')
        page.login.inputLoginInfo(data.yan);
        page.login.clickSignIn();
        browser.waitForAngular();
        expect(browser.getCurrentUrl()).toEqual('http://localhost:9000/#/main')
    });
});