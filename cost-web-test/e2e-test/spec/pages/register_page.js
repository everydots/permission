var register_page = function () {

    var register = element(by.css('a[ng-href="#/register"]'));
    this.clickRegister = function () {
        register.click();
    };
    this.inputRegisterInfo = function (user) {
        element(by.model('user.username')).sendKeys(user.username);
        element(by.model('user.email')).sendKeys(user.email);
        element(by.model('user.password')).sendKeys(user.password);
        element(by.id('confirm')).sendKeys(user.password);
    };
    this.clickSignUp = function () {
        element(by.css('button[ng-click="register(user)"]')).click();
    }

};
module.exports = new register_page();

