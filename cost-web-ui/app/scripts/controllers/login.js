'use strict';

costAnalysisApp
  .controller('loginCtrl', ['$scope', '$location', 'loginPageService', function ($scope, $location, loginPageService) {
    $scope.labels = [];
    $scope.data = [];
    $scope.user = {
      username: '',
      password: '',
      isRemember: false
    };
    $scope.login = function (user) {
      loginPageService
        .login(user)
        .then(function (result) {
          if (result) {
            $location.path("main");
          }
        });
    }
  }]);
