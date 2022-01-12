//Use Effect Code
function Clock() {
  const [time, setTime] = React.useState(new Date().toLocaleTimeString());

  React.useEffect(() => {
    const timerID = setInterval(refresh, 1000);
    return () => {
      clearInterval(timerID);
    };
  }, []);

  const refresh = () => {
    setTime(new Date().toLocaleTimeString());
  };

  return (
    <div>
      <p>{time}</p>
    </div>
  );
}

ReactDOM.render(<Clock />, document.getElementById('root'));
//State Code Below
// function Counter({ initialCount }) {
//   const [count, setCount] = React.useState(initialCount);
//   return (
//     <>
//       Count: {count}
//       <button onClick={() => setCount(initialCount)}>Reset</button>
//       <button onClick={() => setCount((prevCount) => prevCount - 1)}>
//         Decrement
//       </button>
//       <button onClick={() => setCount((prevCount) => prevCount + 1)}>
//         Increment
//       </button>
//     </>
//   );
// }

// ReactDOM.render(<Counter initialCount={0} />, document.getElementById('root'));

//State Code Below
//   const refresh = () => {
//     setTime(new Date().toLocaleTimeString());
//   };

//   return (
//     <div>
//       <p>{time}</p>
//       <button onClick={refresh}>Refresh</button>
//     </div>
//   );
// }

// ReactDOM.render(<Clock />, document.getElementById('root'));
