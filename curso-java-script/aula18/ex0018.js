var num = window.document.querySelector('input#fnum')
var list = window.document.querySelector('select#flista')
var res = window.document.querySelector('div#resultado')
var valores = []
var soma = 0

function isNumero(n) {
    if (Number(n) >= 1 && Number(n) <= 100) {
        return true
    } else {
        return false
    }
}

function inLista(n, l) {
    if (l.indexOf(Number(n)) != -1) {
        return true
    } else {
        return false
    }
}

function adicionar() {
    res.innerHTML = ''
    if (isNumero(num.value) && !inLista(num.value, valores)) {
        valores.push(Number(num.value))
        valores.sort()
        let resposta = window.document.createElement('option')
        resposta.innerText = `O valor ${num.value} foi adicionado`
        list.appendChild(resposta)
    } else {
        window.alert('Valor inválido ou já encontrado na lista.')
    }
    num.value = ''
    num.focus()
}



function finalizar() {
    let total = valores.length
    let menor = valores[0]
    let maior = valores[0]

    for (let pos in valores) {
        soma += valores[pos]
        if (valores[pos] > maior) {
            maior = valores[pos]
        }
    }

    if (valores.length == 0) {
        window.alert('[ERRO] Nenhum valor foi adicionado.')
    } else if (valores.length == 1) {
        res.innerHTML = `<p>Ao todo, temos ${total} número cadastrado</p>`
    } else if (valores.length > 1) {
        res.innerHTML = `<p>Ao todo, temos ${total} números cadastrados</p>`
    }

    let media = soma / total
    res.innerHTML += `<p>O maior valor informado foi ${maior}.</p>`

    res.innerHTML += `<p>O menor valor informado foi ${menor}.</p>`

    res.innerHTML += `<p>Somando todos os valores, temos ${soma}`

    res.innerHTML += `<p>A média dos valores digitados é ${media}`
}