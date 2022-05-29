using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace API_LISTA_TELEFONICA.Model
{
    [Table("Contato")]
    public class Contato
    {

        [Key]
        public int Id { get; set; }
        public string Nome { get; set; }
        public int DDD { get; set; }
        public string Numero { get; set; }
        public string Operadora { get; set; }
        public string Cor { get; set; }
        public DateTime DataCadastro { get; set; }

    }
}
