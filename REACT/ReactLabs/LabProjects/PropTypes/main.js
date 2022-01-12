//same with function components

// function Greeter(props) {
//   return <h1>Hello, {props.name}</h1>;
// }

class Greeter extends React.Component {
  render() {
    return <h1>Hello, {this.props.name}</h1>;
  }
}

Greeter.propTypes = {
  name: PropTypes.string.isRequired,
};

const element = <Greeter name="Joe" />;
ReactDOM.render(element, document.getElementById('root'));
//If you don't define name the proptype has it defined
//if you don't use the defined property
//so it will send an error message to the browser
