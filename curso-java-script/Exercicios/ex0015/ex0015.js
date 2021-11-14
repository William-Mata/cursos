function verificarinformacoes() {
    var data = new Date()
    var ano = data.getFullYear()
    var anonascimento = window.document.querySelector('input#anonascimento')
    var sexo = window.document.getElementsByName('sexo')
    var genero = ''
    var msg = window.document.getElementById('msg')
    var foto = window.document.getElementById('imagem')
    var idade = ano - Number(anonascimento.value)
    var res = window.document.getElementById('res')
    if (sexo[0].checked) {
        genero = 'Homem'
    } else if (sexo[1].checked) {
        genero = 'Mulher'
    }
    if (anonascimento.value == 0 || Number(anonascimento.value) > ano) {
        window.alert('[ERRO] Verifique os dados e tente novamente!')
    } else if (idade <= 25 && genero == "Homem") {
        msg.innerHTML = `<p>Detectamos Rio, Sexo: ${genero}, Idade: ${idade}.</p>`
        foto.src = "imagens/rio.png"
    } else if (idade <= 25 && genero == "Mulher") {
        // tokyo 
        msg.innerHTML = `<p>Detectamos Tokyo, Sexo: ${genero}, Idade: ${idade}.</p>`
        foto.src = "imagens/toquio.png"
    } else if (idade <= 35 && genero == "Homem") {
        // denver
        msg.innerHTML = `<p>Detectamos Denver, Sexo: ${genero}, Idade: ${idade}.</p>`
        foto.src = 'imagens/denver.png'
    } else if (idade <= 35 && genero == "Mulher") {
        // nairobi
        msg.innerHTML = `<p>Detectamos Nairobi, Sexo: ${genero}, Idade: ${idade}.</p>`
        foto.src = 'imagens/nairobi.png'
    } else if (idade <= 40 && genero == "Mulher") {
        // monica
        msg.innerHTML = `<p>Detectamos Monica, Sexo: ${genero}, Idade: ${idade}.</p>`
        foto.src = "imagens/monica.png"
    } else if (idade <= 45 && genero == "Homem") {
        // professor
        msg.innerHTML = `<p>Detectamos Professor, Sexo: ${genero},Idade: ${idade}.</p>`
        foto.src = 'imagens/professor.png'
    } else if (idade <= 45 && genero == "Mulher") {
        // raquel
        msg.innerHTML = `<p>Detectamos Raquel, Sexo: ${genero}, Idade: ${idade}.</p>`
        foto.src = 'imagens/raquel.png'

    } else if (idade <= 50 && genero == "Homem") {
        // berlim
        msg.innerHTML = `<p>Detectamos Berlim, Sexo: ${genero}, Idade: ${idade}.</p> `
        foto.src = 'imagens/berlim.png'
    }
}