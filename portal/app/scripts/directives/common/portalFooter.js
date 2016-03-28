angular.module("portalApp")
    .directive('portalFooter', function () {
        return {
            restrict: "A",
            templateUrl: "../../../views/common/footer.html"
        }
    });
