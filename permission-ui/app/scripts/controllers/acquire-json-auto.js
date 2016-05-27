var productType = "superToTTRPension";
var clientType = "existing";
var pickedMember = {
    "surname": "IntTestLastName",
    "firstName": "IntTest IntTestMiddleName",
    "clientId": "100001419",
    "accountNumber": "902000193",
    "productName": "BrighterPension",
    "balance": null,
    "memberDocs": null,
    "segment": null,
};

var findRootScope = function (currentScope) {
    if (currentScope.$parent) {
        currentScope = currentScope.$parent;
        return findRootScope(currentScope);
    }
    return currentScope;
};
var callback = function () {
    console.log("success!!!!!");
    $("button:contains('Search')").click();

    $(document).ajaxStop(function () {
        $("table").scope().searchClientID = clientType;
        $("table").scope().productType = productType;
        $("table").scope().clientType = clientType;
        $("table").scope().pickedMember = pickedMember;
        $("table").scope().$apply();
    });
};
findRootScope($("table").scope()).$on('$routeChangeSuccess', callback);
$("a[href='#/createAccount']").click();





