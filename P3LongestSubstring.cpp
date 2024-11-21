#include "P3LongestSubstring.h"

int P3LongestSubstring::lengthOfLongestSubstring(std::string s)
{
    
    //We going to use map for this problem
    std::map<char,int> aux;
    //We are going to view all the chars in the string
    //We will create a aux sum
    int start = 0;
    int largestString = 0;//We will return this variable
    int topo = s.length();
    for(int i = 0 ; i < topo; i++ )
    {
        char currentChar = s[i];//Is the current char that we are in the string
        //First we will see the if we have the char in the map
        if(aux.find(currentChar) != aux.end() && aux[currentChar] >= start)
        {
            //If we are her we need to save the st art of the new subString
            //We will modify the value one more in the currentChar
            start = aux[currentChar] + 1;
        }
        //We will save or replace the index that we have the currentDay
        aux[currentChar] = i;
        //Always see what is the max value the largestString or the actual index rest the start plus 1 and we have the size of the subString
        largestString = std::max(largestString,i-start+1);
    }

    return largestString;

}

void P3LongestSubstring::test()
{
    if(this->lengthOfLongestSubstring("abcabcbb") != 3)
    {
        std::cout << "The first test fails" << std::endl;
        return;
    }
    std::cout << "The first test pass" << std::endl;

    if(this->lengthOfLongestSubstring("bbbbb") != 1)
    {
        std::cout << "The second test fails" << std::endl;
        return;
    }
    std::cout << "The second test pass" << std::endl;

    if(this->lengthOfLongestSubstring("pwwkew") != 3)
    {
        std::cout << "The third test fails" << std::endl;
        return;
    }
    std::cout << "The third test pass" << std::endl;

    
    if(this->lengthOfLongestSubstring("dvdf") != 3)
    {
        std::cout << "The fourth test fails" << std::endl;
        return;
    }
    std::cout << "The fourth test pass" << std::endl;
}