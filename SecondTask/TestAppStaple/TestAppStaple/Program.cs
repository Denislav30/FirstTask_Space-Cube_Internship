namespace TestAppStaple
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Staple staple = new Staple("DolceGabbana", "white", 50);

            Office office = new Office(staple);

            Person person = new Person("Denis", 21, office);

            Console.WriteLine($"Welcome to the office {person.Name}!");

            Console.WriteLine($"You have on your desk staple with brand name '{staple.Brand}', with color '{staple.Color}' and capacity '{staple.Capacity}'");

            Console.WriteLine("You have to start working now!");

            person.Staple(30);

        }
    }
}
