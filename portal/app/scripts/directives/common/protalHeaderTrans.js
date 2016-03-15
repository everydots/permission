angular.module("portalApp")
  .directive('portalHeaderTrans', function () {
    return {
      require: 'ngModel',
      restrict: "A",
      controller: function ($scope) {
        $scope.services = ["Service1", "Service2"];
      },
      templateUrl: "../../../views/nav.html"
    }

  });
