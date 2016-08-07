'use strict';

costAnalysisApp
  .controller('loginCtrl', ['$scope', '$location', '$cookieStore', 'loginService', function ($scope, $location, $cookieStore, loginService) {
    $scope.labels = [];
    $scope.data = [];
    $scope.user = {
      username: '',
      password: '',
      isRemember: false
    };
    $scope.login = function (user) {
      loginService
        .login(user)
        .then(function (result) {
          if (result) {
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
