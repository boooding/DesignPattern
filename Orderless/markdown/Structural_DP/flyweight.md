
- 享元模式要求 将对象的属性划分为**内部状态**与**外部状态**(状态在这里通常指属性)
  - 划分状态
    -  内部状态存储于对象内部。 
    -  内部状态可以被一些对象共享。 
    -  内部状态独立于具体的场景，通常不会改变。 
    -  外部状态取决于具体的场景，并根据场景而变化，外部状态不能被共享。
    - 例子：男女模特衣服，性别为内部状态，衣服种类为外部状态
    - 