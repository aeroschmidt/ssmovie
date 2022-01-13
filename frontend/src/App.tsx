import Navbar from "./components/Navbar";
import Listing from "pages/Listing";
import Form from "pages/Form";

import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import React, { Component }  from 'react';

function App() {
  return (
    <BrowserRouter>
    <Navbar/>
    <Routes>
        <Route path="/" element={<Listing />} />
        <Route path="/form">
          <Route path=":moveid" element={<Form/>}/>
      </Route>
    </Routes>
    </BrowserRouter>
    
  );
}

export default App;
