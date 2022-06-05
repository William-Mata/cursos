using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace API_LISTA_TELEFONICA.Migrations
{
    public partial class UpdateContatoTable : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<string>(
                name: "Serial",
                table: "Contato",
                type: "nvarchar(max)",
                nullable: false,
                defaultValue: "");
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropColumn(
                name: "Serial",
                table: "Contato");
        }
    }
}
