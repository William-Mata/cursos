function contador() {
    var inicio = window.document.getElementById('inicio')
    var inicio = Number(inicio.value)
    var fim = window.document.getElementById('fim')
    var fim = Number(fim.value)
    var passo = window.document.getElementById('passo')
    var passo = Number(passo.value)
    var soma = 0
    var resultado = window.document.getElementById('resultado')
    resultado.innerHTML += `<p>Contado: </p>`
    if (inicio.value == 0 || fim.value == 0 || passo.value == 0) {
        window.alert(`[ERRO] O número digitado e invalido.`)

    } else if (inicio <= fim) {
        while (inicio <= fim) {
            soma = inicio
            resultado.innerHTML += `\u{2620}  ${soma} `
            inicio = inicio + passo
        }
    } else if (inicio >= fim) {
        while (inicio >= fim) {
            soma = inicio
            resultado.innerHTML += `\u{2620}  ${soma} `
            inicio = inicio - passo
        }
    }
    resultado.innerHTML += `\u{2693}`
}