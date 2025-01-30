using System;
   public class AnagramCheck
    {
        public static void Main(string[] args)
        {
            string str1 = "Care";
            string str2 = "Race";
            
            str1 = str1.ToLower();
            str2 = str2.ToLower();

            if (str1.Length == str2.Length)
            {
                char[] s1 = str1.ToCharArray();
                char[] s2 = str2.ToCharArray();

                Array.Sort(s1);
                Array.Sort(s2);

                bool result = s1.SequenceEqual(s2);

                if (result)
                {
                    Console.WriteLine($"{str1} and {str2} are anagrams.");
                }
                else
                {
                    Console.WriteLine($"{str1} and {str2} are not anagrams.");
                }
            }
            else
            {
                Console.WriteLine($"{str1} and {str2} are not anagrams.");
            }
        }
}
