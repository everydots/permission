var login_page = function () {

    var login = element(by.css('a[ng-href="#/login"]'));
    this.clickLogin = function () {
        login.click();
    };
    this.inputLoginInfo = function (user) {
        element(by.model('user.username')).sendKeys(user.username);
        element(by.model('user.password')).sendKeys(user.password);
    };
    this.clickSignIn = function () {
        element(by.css('button[ng-click="login(user)"]')).click();
    }
};
module.exports = new login_page();

