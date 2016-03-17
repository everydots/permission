angular.module("portalApp")
  .directive('portalHeaderTrans', function () {
    return {
      require: 'ngModel',
      restrict: "A",
      templateUrl: "../../../views/nav.html"
    }
  });
