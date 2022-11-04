import React from 'react';
import ReactDOM from 'react-dom/client';

// import './index.css';
// import App from './App';
// import reportWebVitals from './reportWebVitals';
import App from "./router/App.tsx"
import { BrowserRouter as Router } from 'react-router-dom';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <Router>
    <App />
  </Router>
  // <React.StrictMode>
  //    hello
  //  </React.StrictMode>,
);
// ReactDOM.render(
//   // <WebRouter />,
//   <React.StrictMode>
//     hello
//   </React.StrictMode>,
//   document.getElementById('root')
// );
// ReactDOM.render(
//   <WebRouter>

//   </WebRouter>,
//   document.getElementById('root')
// );

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
// reportWebVitals();

 