angular.module('ListaTelefonica').controller('ListaTelefonicaCtrl', function ($scope, $filter, contatosApi, operadorasApi, serialGenerator) {
    $scope.title = "Lista Telefonica";
    $scope.listaTel = [];
    $scope.listaOpe = [];

    // PEGA TODOS OS CONTATOS
    $scope.listaContatos = () => {
        contatosApi.getContatos().then((response) => {
            response.data.map((item) => {
                $scope.listaTel.push(item);
            })
        })
    };
    $scope.listaContatos();

    // CADASTRA UM CONTATO
    $scope.cadastrarContato = (contato) => {
        contato.serial = serialGenerator.generate();
        contato.dataCadastro = new Date();
        contatosApi.postContato(contato).then(() => {
            $scope.listaTel.push(contato);
            delete $scope.contato;
            $scope.contatoForm.$setPristine();
        })
    };

    // DELETA UM CONTATO
    $scope.apagarContato = () => {
        $scope.listaTel.map((contato) => {
            if (contato.selecionado) {
                $scope.listaTel.splice(listaOper.indexOf(contato));
                contatosApi.removeContato(contato).then((response) => {
                    delete $scope.contato;
                    $scope.contatoForm.$setPristine();
                })
            }
        })
    }

    // PEGA TODOS AS OPERADORAS
    $scope.listaOperadoras = () => {
        operadorasApi.getOperadoras().then((response) => {
            response.data.map((item) => {
                $scope.listaOpe.push(item);
            })
        })
    };

    $scope.listaOperadoras();



    // VERIFICAR SE A ALGUM MARCADO PARA ALTERAR OU APAGAR
    $scope.isContatoSelecionado = function (contatosSelecionado) {
        if (contatosSelecionado != null) {
            return contatosSelecionado.some((contato) => {
                return contato.selecionado;
            })
        }
    }

    $scope.buscar = function (filtro) {
        $scope.filtro = filtro;
    }

    $scope.ordernarPor = function (ordem) {
        $scope.ordem = ordem;
        $scope.direcao = !$scope.direcao;
    }

    $scope.classe1 = "selecionado";
    $scope.classe2 = "negrito";
    $scope.ativo = false;

});