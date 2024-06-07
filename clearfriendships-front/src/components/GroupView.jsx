import React, { useState } from "react";

function GroupView({ setView }) {
  const viewsAvailable = ["expenses", "members", "settings"];

  const handleSelectView = (event) => {
    setView(event.target.value);
  };

  return (
    <div>
      {viewsAvailable.map((v) => (
        <button key={`key${v}`} onClick={handleSelectView} value={v}>
          {v}
        </button>
      ))}
    </div>
  );
}

export default GroupView;
