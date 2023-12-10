using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestAppStaple
{
    internal class Staple
    {
        public string Brand;
        public string Color;
        public int Capacity;

        public Staple(string brand, string color, int capacity)
        {
            Brand = brand;
            Color = color;
            Capacity = capacity;
        }

        public void StapplePage(int pages)
        {
            Console.WriteLine($"I stappled {pages} pages.");
        }

    }
}
