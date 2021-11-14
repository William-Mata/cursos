function horadodia() {
    var corquadrado = window.document.getElementById('corquadrado')
    var foto = window.document.getElementById('foto')
    var msg = window.document.getElementById('msg')
    var data = new Date()
    var hora = data.getHours()
    msg.innerHTML = `<strong>Agora são ${hora} horas.<strong>`
    if (hora < 12) {
        foto.src = "manha.png"
        document.body.style.background = '#b9be15'
    } else if (hora < 18) {
        foto.src = "tarde.png"
        document.body.style.background = '#bd8e48'
    } else {
        foto.src = "noite.png"
        document.body.style.background = '#402420'
    }
}