var app = angular.module("ratingsListApp", []);
app.controller("ratingsListController", function($scope, $http) {

    $http({
        method: "GET",
        url: "ratings.csv",
    }).then(function processData(response) {
        $scope.events = response.data.split(/\r\n|\n/);

    }, function error(response) {
        console.log("Error");
    });

    
});
