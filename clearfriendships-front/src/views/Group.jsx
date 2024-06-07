import React, { useState } from "react";
import GroupHeader from "../components/GroupHeader";
import GroupView from "../components/GroupView";
import GroupExpenses from "../components/GroupExpenses";

const GROUP_DEMO = {
  name: "GRUPO 1",
  img: "https://img.freepik.com/foto-gratis/comunidad-jovenes-posando-juntos_23-2148431391.jpg?size=626&ext=jpg",
  expenses: [
    {
      member: "Member 1",
      quantity: 1000,
      concept: "concept 1",
      date: "10/03/2024",
    },
    {
      member: "Member 4",
      quantity: 2000,
      concept: "concept 4",
      date: "11/03/2024",
    },
    {
      member: "Member 3",
      quantity: 1500,
      concept: "concept  3",
      date: "10/03/2024",
    },
  ],
  members: [
    { name: "Member 1", spent: 1000 },
    { name: "Member 2", spent: 0 },
    { name: "Member 3", spent: 1500 },
    { name: "Member 4", spent: 2000 },
  ],
};

function Group() {
  const [view, setView] = useState("expenses");

  return (
    <div>
      <GroupHeader name={GROUP_DEMO.name} img={GROUP_DEMO.img} />
      <GroupView setView={setView} />
      {view === "expenses" && <GroupExpenses />}
    </div>
  );
}

export default Group;
