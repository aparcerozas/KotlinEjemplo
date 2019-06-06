fun main() {
    var s: Seleccion = Seleccion(1,"Pedro")
    var x: Xogador = Xogador(7, "delantero", 2, "Cristiano")
    var a: Seleccion = Adestrador(3, "Zinedine")
    var m: Masaxista = Masaxista("experto", 15, 4, "Marta")

    s.concentrarse()
    s.viaxar()

    x.concentrarse()
    x.viaxar()

    println(a.toString())
    println(m.toString())

    a.nome = "Zidane"
    m.id = 7

    println(a.nome)
    println(m.id)

}