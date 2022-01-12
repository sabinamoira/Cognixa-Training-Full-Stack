function FruitListItem(props) {
  const fruit = props.fruit;
  return <li key={fruit.id}>{fruit.name}</li>;
}

function FruitList(props) {
  const fruitListItems = props.fruits.map((fruit) => (
    <FruitListItem fruit={fruit} />
  ));
  return <ul>{fruitListItems}</ul>;
}

const data = [
  { id: 1, name: 'apple' },
  { id: 2, name: 'orange' },
  { id: 3, name: 'blueberry' },
  { id: 4, name: 'banana' },
  { id: 5, name: 'kiwi' },
];
ReactDOM.render(<FruitList fruits={data} />, document.getElementById('root'));
