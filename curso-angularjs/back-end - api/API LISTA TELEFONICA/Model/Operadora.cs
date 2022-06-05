using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace API_LISTA_TELEFONICA.Model
{
    [Table("Operadora")]
    public class Operadora
    {
        [Key]
        public int Id { get; set; }
        public string ? Nome { get; set; }
        public string ? Categoria { get; set; }
        public double Valor { get; set; }
    }
}
