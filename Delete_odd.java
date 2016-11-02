package github;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Delete_odd {
	public static class LinkedListNode {
		int val;
		LinkedListNode next;

		LinkedListNode(int node_value) {
			val = node_value;
			next = null;
		}
	};

	public static LinkedListNode _insert_node_into_singlylinkedlist(LinkedListNode head, LinkedListNode tail, int val) {
		if (head == null) {
			head = new LinkedListNode(val);
			tail = head;
		} else {
			tail.next = new LinkedListNode(val);
			tail = tail.next;
		}
		return tail;
	}

	static LinkedListNode deleteOdd(LinkedListNode list) {
		
		LinkedListNode head=list;
		LinkedListNode temp=null;
		LinkedListNode temp2=null;
		LinkedListNode final_ans =null;
		if(head!=null && head.val%2!=0){
			temp=head;
			System.out.println("jjj"+head.val);
			final_ans = temp;
		}
		
		while(list!=null){
			if(temp!=null){System.out.println("$$$$$$$$$$"+head.val+"****"+temp.val);}
			
			if(head.next==null){
				return temp;
			}
			temp2=head;
			head=head.next;
			if(head.val%2!=0){
				
				temp=temp2.next;
				if(final_ans ==null)
				{final_ans = temp;}
			}
			list=list.next;
		}

        return final_ans;
		 
		
		
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		// final String fileName = System.getenv("OUTPUT_PATH");
		// BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		LinkedListNode res;

		int _list_size = 0;
		_list_size = Integer.parseInt(in.nextLine());
		int _list_i;
		int _list_item;
		LinkedListNode _list = null;
		LinkedListNode _list_tail = null;
		for (_list_i = 0; _list_i < _list_size; _list_i++) {
			_list_item = Integer.parseInt(in.nextLine().trim());
			if (_list_i == 0) {
				_list = _insert_node_into_singlylinkedlist(_list, _list_tail, _list_item);
				_list_tail = _list;
			} else {
				_list_tail = _insert_node_into_singlylinkedlist(_list, _list_tail, _list_item);
			}
		}

		res = deleteOdd(_list);
		while (res != null) {
			System.out.println(res.val);
			// bw.write(String.valueOf(res.val));
			// bw.newLine();
			res = res.next;
		}

		// bw.close();
	}
}