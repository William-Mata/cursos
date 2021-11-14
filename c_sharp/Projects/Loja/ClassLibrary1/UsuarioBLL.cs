using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Loja.DAL;
using Loja.DTO;


namespace Loja.BLL
{
    public class UsuarioBLL
    {

        public IList<UsuarioDTO> cargaUsuario()
        {
            try
            {
                return new UsuarioDAL().cargaUsuario();
            }
            catch (Exception ex)
            {

                throw ex;
            }

        }

        public int insereUsuario(UsuarioDTO USU)
        {
            try
            {
                return new UsuarioDAL().insereUsuario(USU);
            }
            catch(Exception ex)
            {
                throw ex;
            }
        }

        public int alterarUsuario(UsuarioDTO USU)
        {
            try
            {
                return new UsuarioDAL().alterarUsuario(USU);
            }
            catch (Exception ex)
            {
                throw ex;
            }

        }

        public int removerUsuario(UsuarioDTO USU)
        {
            try
            {
                return new UsuarioDAL().removerUsuario(USU);
            }
            catch (Exception ex)
            {
                throw ex;
            }
        }
    }
}
