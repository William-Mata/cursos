angular.module('ListaTelefonica').controller('ListaOperadorasCtrl', function ($scope, $filter, $http) {

    $scope.listaOper = [];

    // PEGA TODOS OS OPERADORAS
    $scope.listaOperadoras = () => {
        $http({
            method: 'GET',
            url: 'https://localhost:7093/api/Operadoras'
        }).then((response) => {
            response.data.map((item) => {
                $scope.listaOper.push(item);
            })
        })
    };
    $scope.listaOperadoras();

    // CADASTRA UM CONTATO
    $scope.cadastrarOperadora = (operadora) => {
        $http({
            method: 'POST',
            url: 'https://localhost:7093/api/Operadoras/',
            data: contato

        }).then((respon) => {
            $scope.listaOper.push(operadora);
            delete $scope.operadora;
            $scope.contatoForm.$setPristine();

        })
    };

    // DELETA UM CONTATO
    $scope.apagarOperadora = () => {
        $scope.listaTel.map((operadora) => {
            if (contato.selecionado) {
                $http({
                    method: 'DELETE',
                    url: 'https://localhost:7093/api/Operadoras/' + operadora.id
                }).then((response) => {
                    $scope.listaOper.splice(listaOper.indexOf(operadora));
                    delete $scope.operadora;
                    $scope.contatoForm.$setPristine();
                })
            }
        })
    }

});
