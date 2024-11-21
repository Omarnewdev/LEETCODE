#ifndef P2ADDTWONUMBERS_H
#define P2ADDTWONUMBERS_H

#include<iostream>
#include<vector>

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class P2AddTwoNumbers
{
public:
    ListNode* addTwoNumbers(ListNode* l1,ListNode* l2);
    void test();
};



#endif