using Microsoft.EntityFrameworkCore;

namespace API_LISTA_TELEFONICA.Model
{
    public class Context : DbContext
    {

        public Context(DbContextOptions<Context> options) : base(options)
        {}

        public DbSet<Contato> Contato { get; set; }
    }
}
