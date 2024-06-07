import "./App.css";

import { Routes, Route, useNavigate } from "react-router-dom";

// IMPORTACION DE VISTAS

import NavBar from "./components/NavBar";
import Home from "./views/Home";
import Profile from "./views/Profile";
import Search from "./views/Search";
import Group from "./views/Group";

function App() {
  return (
    <>
      <NavBar />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/profile" element={<Profile />} />
        <Route path="/search" element={<Search />} />
        <Route path="/group/:id" element={<Group />} />
      </Routes>
    </>
  );
}

export default App;
