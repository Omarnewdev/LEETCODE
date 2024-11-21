#include "P2AddTwoNumbers.h"

ListNode* P2AddTwoNumbers::addTwoNumbers(ListNode* l1,ListNode* l2)
{
    //First we gonna create an head how aux pointer
    //We are going to start it with 0
    ListNode* aux = new ListNode(0);
    //After that we create a tail pointer, that points the last node
    ListNode* tail = aux;
    //When a sum pass of 10 we need to save the carry value
    int carry = 0;
    //We are going to create a loop, that will see after
    //l1 and l2 don´t have any value and we don´t have any
    //value to carry


    while(l1!=nullptr || l2!=nullptr|| carry!=0)
    {
        //We are going to see if we have a value in the first list
        //If l1 doesn´t have a value we use 0
        int digit1 = (l1!=nullptr)?l1->val:0;
        //We do the same with the l2
        int digit2 = (l2!=nullptr)?l2->val:0;
        //We need to add the two digits
        int sum = digit1 + digit2;
        //We need to take the last digit two start the new list
        //We use the tail list
        int sumAux = sum+carry;//In this part we use a aux if it is bigger than 10
        tail->next = new ListNode(sumAux%10);
        //The we posionate the tail in the next pointer
        tail = tail->next;
        //After that if the add have a carry value we take it
        carry = sumAux/10;

        //Finally we move the two lists
        l1=(l1==nullptr)?nullptr:l1->next;
        l2=(l2==nullptr)?nullptr:l2->next;
    }  
    //After that we send the next node of the aux node
    ListNode* result = aux->next;
    delete aux;
    return result;
}

void P2AddTwoNumbers::test()
{
    //We are goona create three tests
    ListNode* l1;
    ListNode* l2;
    l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
    l2 = new ListNode(5,new ListNode(6,new ListNode(4)));
    ListNode* result= this->addTwoNumbers(l1,l2);
    ListNode* test =  new ListNode(7,new ListNode(0,new ListNode(8)));
    while(test!=nullptr)
    {
        if(test->val!=result->val)
        {
            std::cout << "Don't pass the first test"<<std::endl;
            return;
        }
        test=test->next;
        result=result->next;
    }
    std::cout << "Pass the first test"<<std::endl;
    
    l1 = new ListNode(0);
    l2 = new ListNode(0);
    result = this->addTwoNumbers(l1,l2);
    test = new ListNode(0);
    while(test!=nullptr)
    {
        if(test->val!=result->val)
        {
            std::cout << "Don't pass the second test"<<std::endl;
            return;
        }
        test=test->next;
        result=result->next;
    }
    std::cout << "Pass the second test"<<std::endl;
    
    l1 = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9)))))));
    l2 = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))));
    result = this->addTwoNumbers(l1,l2);
    test = new ListNode(8,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(1))))))));

    while(test!=nullptr)
    {
        if(test->val!=result->val)
        {
            std::cout << "Don't pass the third test"<<std::endl;
            return;
        }
        test=test->next;
        result=result->next;
    }
    std::cout << "Pass the third test"<<std::endl;

    std::cout << std::endl;
}