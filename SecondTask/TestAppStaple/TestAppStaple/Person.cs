using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestAppStaple
{
    internal class Person
    {
        public string Name { get; set; }
        public int Age { get; set; }

        public Office Office { get; set; }

        public Person(string name, int age, Office office)
        {
            Name = name;
            Age = age;
            this.Office = office;
        }

        public void Staple(int pages)
        {
            Office.StapleDocument(pages);
        }

    }
}
