<style>
div {
box-shadow: 5px 5px #888888;
border : 1px solid red;
margin : 16px;
padding : 1rem;
}
div:hover {
cursor:pointer;
box-shadow: 5px 10px #888888;
}
</style>

<li style="color:purple;">A Thread is a piece of code with own path/channel of execution.</li>
<br>
<li style="color:purple;">An application performing multiple tasks and each task is a thread and a thread is a piece of code with its own channel of execution.</li>

<div  style="color:#6528F7; border:1px solid purple; padding:1rem; margin:1rem;background-color:#F2D8D8;">

1. implement an interface Runnable.
2. Extends a class Called Thread

--> Implements an interface Runnable
example :- class SpellCheckerThread extends Thread {}

<strong>javap java.lang.Runnable</strong>

</div>

<div style="color:#068FFF; border:1px solid #FF0060; padding:1rem; margin:1rem;background-color:#AEE2FF;">

class AutoSaveThread {}
</div>

<div>
whenever a thread is created JVM assigns it priority

minimum priority :- 0
maximum priority :- 10
</div>