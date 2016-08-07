'use strict';

costAnalysisApp
  .controller('loginCtrl', ['$scope', '$location', '$cookieStore', 'loginService', function ($scope, $location, $cookieStore, loginService) {
    $scope.labels = [];
    $scope.data = [];
    $scope.user = {
      username: $cookieStore.get('username') || '',
      password: $cookieStore.get('password') || '',
      isRemember: $cookieStore.get('isRemember') || false
    };
    $scope.login = function (user) {
      loginService
        .login(user)
        .then(function (result) {
          if (result) {
            if (user.isRemember === true) {
              loginService.setUserInfoInCookie(user)
            } else {
              loginService.removeUserInfoInCookie()
            }
            $cookieStore.put('isLogged', true);
            $location.path("main");
          }
          else {
            $cookieStore.put('isLogged', false);
            $location.path("loginCtrl");
          }
        });
    }
  }]);
