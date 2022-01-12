function Greeter({ first }, { last }) {
  return (
    <h1>
      Hello, {first} {last}
    </h1>
  );
}
const person = {
  first: 'Elizabeth',
  last: 'Hogan',
};
const element = <Greeter first={person.first} last={person.last} age="23" />;
//const element = <Greeter name="Joe" />;
ReactDOM.render(element, document.getElementById('root'));
