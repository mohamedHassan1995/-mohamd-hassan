package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

import java.util.LinkedList;
import java.util.Stack;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity extends FragmentActivity {

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    Button buttonDivide,buttonTimes,buttonPlus,buttonMinis;
    Button buttonOpenBracket,buttonCloseBracket,buttonDot,buttonEqual;
    Button buttonClear,buttonDelete;
    TextView textView,result;
    LinkedList<Character> mainList = new LinkedList<Character>(){
        public String toString(){
            String str = "";
            int i = 0;
            while (i<this.size()){
                Character c =this.remove(i);
                this.add(i,c);
                str = str + c;
                i++;
            }
            return str;
        }
    };
    boolean prevResult = false;
    boolean error = false;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button1);
        button3 = findViewById(R.id.button2);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonTimes = findViewById(R.id.buttonTimes);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinis = findViewById(R.id.buttonMinis);
        buttonOpenBracket = findViewById(R.id.buttonOpen);
        buttonCloseBracket = findViewById(R.id.buttonClose);
        buttonDot = findViewById(R.id.buttonDot);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonClear = findViewById(R.id.buttonC);
        buttonDelete = findViewById(R.id.buttonX);
        textView = findViewById(R.id.textView);
        result = findViewById(R.id.textView2);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (prevResult) {
                    result.setText("");
                    mainList.clear();
                    prevResult = false;
                }

                if (error = true) {
                    error = false;
                    result.setText("");
                }
                mainList.add('0');
                textView.setText(mainList.toString());

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (prevResult) {
                    result.setText("");
                    mainList.clear();
                    prevResult = false;
                }
                if (error = true) {
                    error = false;
                    result.setText("");
                }
                mainList.add('1');
                textView.setText(mainList.toString());
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (prevResult) {
                    result.setText("");
                    mainList.clear();
                    prevResult = false;
                }
                if (error = true) {
                    error = false;
                    result.setText("");
                }
                mainList.add('2');
                textView.setText(mainList.toString());
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (prevResult) {
                    result.setText("");
                    mainList.clear();
                    prevResult = false;
                }
                if (error = true) {
                    error = false;
                    result.setText("");
                }
                mainList.add('3');
                textView.setText(mainList.toString());
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (prevResult) {
                    result.setText("");
                    mainList.clear();
                    prevResult = false;
                }
                if (error = true) {
                    error = false;
                    result.setText("");
                }
                mainList.add('4');
                textView.setText(mainList.toString());
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (prevResult) {
                    result.setText("");
                    mainList.clear();
                    prevResult = false;
                }
                if (error = true) {
                    error = false;
                    result.setText("");
                }
                mainList.add('5');
                textView.setText(mainList.toString());
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (prevResult) {
                    result.setText("");
                    mainList.clear();
                    prevResult = false;
                }
                if (error = true) {
                    error = false;
                    result.setText("");
                }
                mainList.add('6');
                textView.setText(mainList.toString());
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (prevResult) {
                    result.setText("");
                    mainList.clear();
                    prevResult = false;
                }
                if (error = true) {
                    error = false;
                    result.setText("");
                }
                mainList.add('7');
                textView.setText(mainList.toString());
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (prevResult) {
                    result.setText("");
                    mainList.clear();
                    prevResult = false;
                }
                if (error = true) {
                    error = false;
                    result.setText("");
                }
                mainList.add('8');
                textView.setText(mainList.toString());
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (prevResult) {
                    result.setText("");
                    mainList.clear();
                    prevResult = false;
                }
                if (error = true) {
                    error = false;
                    result.setText("");
                }
                mainList.add('9');
                textView.setText(mainList.toString());
            }
        });

        buttonOpenBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (prevResult) {
                    result.setText("");
                    mainList.clear();
                    prevResult = false;
                }
                if (error = true) {
                    error = false;
                    result.setText("");
                }
                mainList.add('(');
                textView.setText(mainList.toString());
            }
        });

        buttonCloseBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (prevResult) {
                    result.setText("");
                    mainList.clear();
                    prevResult = false;
                }
                if (error = true) {
                    error = false;
                    result.setText("");
                }
                mainList.add(')');
                textView.setText(mainList.toString());
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (prevResult) {
                    result.setText("");
                    mainList.clear();
                    prevResult = false;
                }
                if (error = true) {
                    error = false;
                    result.setText("");
                }
                mainList.add('.');
                textView.setText(mainList.toString());
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (prevResult) {
                    result.setText("");
                    prevResult = false;
                }
                if (error = true) {
                    error = false;
                    result.setText("");
                }
                mainList.add('/');
                textView.setText(mainList.toString());
            }
        });

        buttonTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (prevResult) {
                    result.setText("");
                    prevResult = false;
                }
                if (error = true) {
                    error = false;
                    result.setText("");
                }
                mainList.add('*');
                textView.setText(mainList.toString());
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (prevResult) {
                    result.setText("");
                    prevResult = false;
                }
                if (error = true) {
                    error = false;
                    result.setText("");
                }
                mainList.add('+');
                textView.setText(mainList.toString());
            }
        });

        buttonMinis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (prevResult) {
                    result.setText("");
                    prevResult = false;
                }
                if (error = true) {
                    error = false;
                    result.setText("");
                }
                mainList.add('-');
                textView.setText(mainList.toString());
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (prevResult) {
                    result.setText("");
                    prevResult = false;
                }
                if (error = true) {
                    error = false;
                    result.setText("");
                }
                mainList.clear();
                result.setText("");
                textView.setText(mainList.toString());
            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (prevResult) {
                    mainList.clear();
                    result.setText("");
                    prevResult = false;
                }
                if (!mainList.isEmpty()) {
                    mainList.remove(mainList.size() - 1);
                }
                textView.setText(mainList.toString());
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double res = 0.0;
                if (!mainList.isEmpty()) {

                    res = getResult(mainList);

                    if (res != null) {
                        prevResult = true;
                        mainList.clear();

                        if (res - (int) (double) res == 0.0) {
                            result.setText("" + (int) (double) res);
                            Integer myRes = (int) (double) res;
                            String r = myRes.toString();
                            for (int i = 0; i < r.length(); i++) {
                                mainList.add(r.charAt(i));
                            }
                        } else {
                            result.setText("" + res);
                            String r = res.toString();
                            for (int i = 0; i < r.length(); i++) {
                                mainList.add(r.charAt(i));
                            }
                        }
                    } else {

                        result.setText("Error");
                    }
                } else {
                    result.setText("");
                }
            }
        });
    }
    public Stack getStack ( LinkedList list){

        boolean startOfQueue = true;
        Stack<String> stack = new Stack<String>();
        String lastElement = "";
        boolean negative = false;
        int bracketNumber = 0;
        while (!list.isEmpty()) {
            char c = (char) list.remove();
            if (c >= '0' && c <= '9') {
                double r = 0.0;
                int w = 1;
                boolean afterFloatingPoint = false;
                while (( c >= '0' && c <= '9' ) || c == '.') {
                    if (c == '.' && afterFloatingPoint) {
                        while (!stack.isEmpty()) {
                            stack.pop();
                        }
                        return null;
                    }
                    if (!afterFloatingPoint && c == '.') {
                        afterFloatingPoint = true;
                        if (list.isEmpty()) {
                            break;
                        } else {
                            c = (char) list.remove();
                        }

                    }

                    if (afterFloatingPoint) {
                        r += ( (double) ( c - '0' ) / ( 10 * w ) );
                        w = w * 10;
                    } else {
                        r *= 10;
                        r += ( c - '0' );
                    }
                    if (list.isEmpty()) {
                        break;
                    } else {
                        c = (char) list.remove();
                    }
                }
                if (negative) {
                    r = r * -1;
                    negative = false;
                }
                stack.push("" + r);
                startOfQueue = false;
                lastElement = "" + r;
            }
            if (c < '0' || c > '9') {
                if (startOfQueue && ( c == '+' || c == '*' || c == '/' || c == ')' || c == '.' )) {
                    while (!stack.isEmpty()) {
                        stack.pop();
                    }
                    return null;
                } else if (startOfQueue && c == '-') {
                    negative = true;
                    continue;
                }
                if (negative && ( c < '0' || c > '9' )) {
                    while (!stack.isEmpty()) {
                        stack.pop();
                    }
                    return null;
                }
                boolean b = lastElement.equals("+") || lastElement.equals("-") || lastElement.equals("/") ||
                        lastElement.equals("*");
                if (c == '-' && b) {
                    negative = true;
                    continue;
                } else if (c == '-' && lastElement.equals(".")) {
                    while (!stack.isEmpty()) {
                        stack.pop();
                    }
                    return null;
                }
                if (( c == '+' || c == '/' || c == '*' || c == '.' ) && ( b || lastElement.equals(".") )) {
                    while (!stack.isEmpty()) {
                        stack.pop();
                    }
                    return null;
                }
                if (c == '(') {
                    bracketNumber++;
                }
                if (c == ')') {
                    bracketNumber--;
                }
                if (lastElement.equals("(") && c == ')') {
                    while (!stack.isEmpty()) {
                        stack.pop();
                    }
                    return null;
                }
                startOfQueue = false;
                lastElement = "" + c;
                stack.push("" + c);
            }
            if (bracketNumber < 0) {
                while (!stack.isEmpty()) {
                    stack.pop();
                }
                return null;
            }
        }
        if (bracketNumber != 0) {
            while (!stack.isEmpty()) {
                stack.pop();
            }
            return null;
        }
        boolean b = lastElement.equals(".") || lastElement.equals("+") || lastElement.equals("-") ||
                lastElement.equals("/") || lastElement.equals("*") || lastElement.equals("(");
        if (b) {
            while (!stack.isEmpty()) {
                stack.pop();
            }
            return null;
        }

        return stack;
    }

    double solveBracket ( Stack < String > myStack ) {
        Stack<String> stack = new Stack<String>();
        String s;

        while (!myStack.isEmpty()) {
            s = myStack.pop();
            if (s.equals(")")) {
                Stack<String> _stack = new Stack<String>();
                s = stack.pop();
                while (!s.equals("(")) {
                    _stack.push(s);
                    s = stack.pop();
                }
                stack.push("" + solveDividedTimes(_stack));
            } else {
                stack.push(s);
            }

        }
        while (!stack.isEmpty()) {
            myStack.push(stack.pop());
        }
        return solveDividedTimes(myStack);
    }

    Double solveDividedTimes ( Stack < String > myStack ) {
        //stack to add elements after solving times and divided operations
        Stack<String> stack = new Stack<String>();
        String s;//to iterate on the myStack
        while (!myStack.isEmpty()) {
            s = myStack.pop();//get element
            if (s.equals("*") || s.equals("/")) {//if the element is  "*" or "/" perform the operation
                Double op1, op2, res;
                op1 = Double.parseDouble(stack.pop());//operand one is previous element
                op2 = Double.parseDouble(myStack.pop());//operand two is next element
                //if "*" perform multiplication
                if (s.equals("*")) {
                    res = op1 * op2;
                }
                //else perform division
                else {
                    res = op1 / op2;
                }
                //push the result on the other stack
                stack.push("" + res);
            }
            //if the element is not "*" or "/"
            else {
                //push the element on the other stack
                stack.push(s);
            }
        }
        //rearrange the elements in stack to myStack
        while (!stack.isEmpty()) {
            myStack.push(stack.pop());
        }
        //return the solve of plus and minus operations
        return solvePlusMinis(myStack);
    }

    Double solvePlusMinis ( Stack < String > myStack ) {
        //at begin result equals first element then
        // if the operator is + add the element
        // and if - subtract the element
        Double result = Double.parseDouble(myStack.pop());
        String s;//to iterate on the stack
        while (!myStack.isEmpty()) {
            s = myStack.pop();//get element from stack
            if (s.equals("+")//if operator + add the next element to result
            ) {
                result += Double.parseDouble(myStack.pop());
            } else {//else operator is minus subtract next element from result
                result -= Double.parseDouble(myStack.pop());
            }
        }
        return result;
    }

    public Double getResult ( LinkedList list){
        // result
        Double result = 0.0;
        // temp list to  avoid changing the main list
        LinkedList<Character> temp = new LinkedList<Character>();
        //stack to perform on it the operations
        Stack<String> myStack = null;
        for (int pos = 0; pos < list.size(); pos++) {
            temp.add((Character) list.get(pos));
        }
        //get the stack from the temp list
        myStack = getStack(temp);


        if (myStack != null) { //if stack is not null then all inputs by the user are valid

            Stack<String> arrangedStack = new Stack<String>();
            //rearrange the stack in the arrangedStack
            while (!myStack.isEmpty()) {
                arrangedStack.push(myStack.pop());
            }
            //get the result
            result = solveBracket(arrangedStack);
        } else {//if mystack is null then an error exit return null in the result
            return null;
        }
        return result;

    }
}
