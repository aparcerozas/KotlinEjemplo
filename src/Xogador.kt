class Xogador(id: Int, nome: String): Seleccion(id, nome) {
    var dorsal: Int = 0
    var demarcacion: String = ""

    constructor (dorsal: Int, demarcacion: String, id: Int, nome: String) : this(id, nome) {
        this.dorsal = dorsal
        this.demarcacion = demarcacion
        this.id = id
        this.nome = nome
    }

    override fun concentrarse() {
        println("Concéntrase o xogador")
    }

    override fun viaxar() {
        println("Viaxa o xogador")
    }
}