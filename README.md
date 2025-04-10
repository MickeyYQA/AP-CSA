# AP Compute Science A Notes

*Note: In VSCode, use **CMD+K V** to preview markdown.*

2024.5.29/

## 0. Variables and Data Types

Primitive(build in) Type:
    - **int, boolean, double, char**
    - *除了primitive类型都是objects. i.e. string*

2024.6.3/

## 1. Expression and Assignment Statements

- 除以0会抛出`runtime error`.
- `!`, `&&`, `||` 三个boolean计算按照优先级not-and-or顺序从高到低。
- int+string=string. e.g.:
- `"hello" + 42 = "hello42"`
- `"1 + 2 + "abc" = "3abc"`

## 2. Compound Assigment

- `x = x + y` <=> `x += y`;
- `+-*/%`同理;
- **强制转换类型**：`(double)1/3 = 0.333333333` whereas `(double)(1/3) == 0.0`

2024.6.5/

## 3. Primitive vs Object

- **primitive** == build-in == int, boolean, double, char
- **object** == user-defined

## Operation

Operation Precedence:

1. ``!,++,--``
2. ``*,/``
3. ``+,-``
4. ``&&``
5. ``||``

## If-else statement

```java
if(test){
    <statement>;
}
else{
    <statement>;
}
```

## De Morgan's Laws

`not(a and b) => (not a) or (not b)`
`not(a or b) => (not a) and (not b)`

2024.6.16/

## While loop

```java
while(test){
    <statement>;
}
```

## For loop

```java
for(init; test; update){
    <statement>;
}
```
