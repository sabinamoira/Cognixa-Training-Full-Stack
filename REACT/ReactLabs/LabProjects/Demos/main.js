//Code to Reuse a component
function Greeting() {
  return <div className="container">Hello Function Component</div>;
}
function App() {
  return (
    // if on different line from return need paranthesis to surround the return statment
    <div>
      <Greeting />
      <Greeting />
      <Greeting />
      <Greeting />
    </div>
  );
}
const rootElement = document.getElementById('root');
ReactDOM.render(<App />, rootElement);

//Code that creates a function Component
// function Greeting() {
//   return <div className="container">Hello Function Component</div>;
// }
// ReactDOM.render(<Greeting />, document.getElementById('root'));

////Code that rerenders the Website efficiently through React
// function renderElement() {
//   const rootElement = document.getElementById('root');
//   const element = (
//     <div className="post">
//       <h1>My First Blog Post</h1>
//       <div>Author: Mark Twain</div>
//       <div>Published: {new Date().toLocaleTimeString()}</div>
//       <p>
//         I am new to blogging and this is my first post. You should expect a lot
//         of great things from me.
//       </p>
//     </div>
//   );
//   ReactDOM.render(element, rootElement);
// }
// setInterval(renderElement, 1000);

//EXTENSION OF BELOW IMAGE CODE (Does same thing provides site greater details over code)
//const rootElement = document.getElementById('root');
// const logo = {
//   name: 'React Logo',
//   title: 'React Logo',
//   path: 'http://static1.squarespace.com/static/575a6067b654f9b902f452f4/59e64b57cf81e064f900819a/5c8c127beb393116ec4e1c52/1552683697079/300Logo.png?format=1500w',
// };
// const element = <img src={logo.path} alt={logo.name} title={logo.title} />;
// ReactDOM.render(element, rootElement);

//CODE TO HAVE IMAGE ON WEBSITE
//const rootElement = document.getElementById('root');
// const element = (
//   <img src="http://static1.squarespace.com/static/575a6067b654f9b902f452f4/59e64b57cf81e064f900819a/5c8c127beb393116ec4e1c52/1552683697079/300Logo.png?format=1500w" />
// );
// ReactDOM.render(element, rootElement);

////Extension of Below Code version(1) JSX
//const rootElement = document.getElementById('root');
// const firstName = 'Moraa';
// const person = { first: 'Joe', last: 'Doe' };

// const element = (
//   <div className="container">
//     Hello {firstName} Hello {person.first} {person.last}
//   </div>
// );

//ALL 3 VERSIONS OF BELOW CODE MAKE SAME LOOKING PAGE IN BROWSER

////1)JSX CODE simpler than other two
//const rootElement = document.getElementById('root');
// const element = <div className="container">Hello World </div>;
// ReactDOM.render(element, rootElement);

////2)PLAIN JAVA SCRIPT CODE:Does Similar to below code NOT preffered way done
//const rootElement = document.getElementById('root');
// const element = document.createElement('div');
// element.textContent = 'Hello World';
// element.className = 'container';
// rootElement.appendChild(element);
// ReactDOM.render(element, rootElement);

////3)REACT CODE: Mimics Above Code NOT preffered way done (Don't ever write create element statments in real world)
//const rootElement = document.getElementById('root');
// const element = React.createElement(
//   'div',
//   { className: 'container' },
//   'Hello World'
// );
////The method signature for createElement is as follows:
////React.createElement(type, [props], [...children])
// ReactDOM.render(element, rootElement);
