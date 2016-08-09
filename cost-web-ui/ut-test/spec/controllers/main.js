'use strict';

describe('Controller: MainCtrl', function () {

    var $scope, $cookieStore;

    // load the controller's module
    beforeEach(module('costAnalysisApp'));

    var MainCtrl,
        scope,
        cookieStore;

    // Initialize the controller and a mock scope
    beforeEach(inject(function ($controller, $rootScope, $cookieStore) {
        scope = $rootScope.$new();
        cookieStore = $cookieStore;
        MainCtrl = $controller('MainCtrl', {
            $scope: scope,
            cookieStore: $cookieStore
            // place here mocked dependencies
        });

        cookieStore.getLoginState.and.returnValue(null);
    }));

    it('should return cookie state when first login', function () {
        var cookieState = $scope.getLoginState();
        expect(cookieState).toBeNull();
    });
});
