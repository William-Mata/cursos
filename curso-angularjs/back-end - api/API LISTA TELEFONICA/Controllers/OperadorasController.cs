using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using API_LISTA_TELEFONICA.Model;

namespace API_LISTA_TELEFONICA.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class OperadorasController : ControllerBase
    {
        private readonly Context _context;

        public OperadorasController(Context context)
        {
            _context = context;
        }

        // GET: api/Operadoras
        [HttpGet]
        public async Task<ActionResult<IEnumerable<Operadora>>> GetOperadora()
        {
          if (_context.Operadora == null)
          {
              return NotFound();
          }
            return await _context.Operadora.ToListAsync();
        }

        // GET: api/Operadoras/5
        [HttpGet("{id}")]
        public async Task<ActionResult<Operadora>> GetOperadora(int id)
        {
          if (_context.Operadora == null)
          {
              return NotFound();
          }
            var operadora = await _context.Operadora.FindAsync(id);

            if (operadora == null)
            {
                return NotFound();
            }

            return operadora;
        }

        // PUT: api/Operadoras/5
        // To protect from overposting attacks, see https://go.microsoft.com/fwlink/?linkid=2123754
        [HttpPut("{id}")]
        public async Task<IActionResult> PutOperadora(int id, Operadora operadora)
        {
            if (id != operadora.Id)
            {
                return BadRequest();
            }

            _context.Entry(operadora).State = EntityState.Modified;

            try
            {
                await _context.SaveChangesAsync();
            }
            catch (DbUpdateConcurrencyException)
            {
                if (!OperadoraExists(id))
                {
                    return NotFound();
                }
                else
                {
                    throw;
                }
            }

            return NoContent();
        }

        // POST: api/Operadoras
        // To protect from overposting attacks, see https://go.microsoft.com/fwlink/?linkid=2123754
        [HttpPost]
        public async Task<ActionResult<Operadora>> PostOperadora(Operadora operadora)
        {
          if (_context.Operadora == null)
          {
              return Problem("Entity set 'Context.Operadora'  is null.");
          }
            _context.Operadora.Add(operadora);
            await _context.SaveChangesAsync();

            return CreatedAtAction("GetOperadora", new { id = operadora.Id }, operadora);
        }

        // DELETE: api/Operadoras/5
        [HttpDelete("{id}")]
        public async Task<IActionResult> DeleteOperadora(int id)
        {
            if (_context.Operadora == null)
            {
                return NotFound();
            }
            var operadora = await _context.Operadora.FindAsync(id);
            if (operadora == null)
            {
                return NotFound();
            }

            _context.Operadora.Remove(operadora);
            await _context.SaveChangesAsync();

            return NoContent();
        }

        private bool OperadoraExists(int id)
        {
            return (_context.Operadora?.Any(e => e.Id == id)).GetValueOrDefault();
        }
    }
}
