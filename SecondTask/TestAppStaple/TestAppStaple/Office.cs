using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestAppStaple
{
    internal class Office
    {
        public Staple Staple {  get; set; }

        public Office(Staple staple)
        {
            this.Staple = staple;
        }

        public void StapleDocument(int pages)
        {
            Staple.StapplePage(pages);
        }

    }
}
